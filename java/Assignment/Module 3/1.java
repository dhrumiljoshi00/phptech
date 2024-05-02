import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;

public class SwingDBExample extends JFrame {
    private JTextField idField, nameField, genderField, addressField, contactField;
    private JButton addButton, clearButton, fetchButton;
    private JTable table;
    private DefaultTableModel model;

    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USER = "username";
    private static final String PASSWORD = "password";

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public SwingDBExample() {
        super("Swing Database Example");
        setLayout(new BorderLayout());

        // Text fields
        idField = new JTextField(10);
        nameField = new JTextField(10);
        genderField = new JTextField(10);
        addressField = new JTextField(10);
        contactField = new JTextField(10);

        // Buttons
        addButton = new JButton("Add");
        clearButton = new JButton("Clear");
        fetchButton = new JButton("Fetch");

        // Table
        model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Gender");
        model.addColumn("Address");
        model.addColumn("Contact");

        // Panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(fetchButton);

        // Panel to hold text fields and table
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Gender:"));
        inputPanel.add(genderField);
        inputPanel.add(new JLabel("Address:"));
        inputPanel.add(addressField);
        inputPanel.add(new JLabel("Contact:"));
        inputPanel.add(contactField);
        inputPanel.add(buttonPanel);

        // Add components to frame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Event listeners
        addButton.addActionListener(e -> addData());
        clearButton.addActionListener(e -> clearFields());
        fetchButton.addActionListener(e -> fetchData());

        // Database connection
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Method to add data to the database
    private void addData() {
        try {
            String id = idField.getText();
            String name = nameField.getText();
            String gender = genderField.getText();
            String address = addressField.getText();
            String contact = contactField.getText();

            String query = "INSERT INTO mytable (id, name, gender, address, contact) VALUES ('" + id + "', '" + name + "', '" + gender + "', '" + address + "', '" + contact + "')";
            statement.executeUpdate(query);

            clearFields();
            fetchData();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Method to clear text fields
    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        genderField.setText("");
        addressField.setText("");
        contactField.setText("");
    }

    // Method to fetch data from the database and display in the table
    private void fetchData() {
        try {
            String query = "SELECT * FROM mytable";
            resultSet = statement.executeQuery(query);

            // Clear existing rows
            model.setRowCount(0);

            // Populate table with data from ResultSet
            while (resultSet.next()) {
                Vector row = new Vector();
                row.add(resultSet.getString("id"));
                row.add(resultSet.getString("name"));
                row.add(resultSet.getString("gender"));
                row.add(resultSet.getString("address"));
                row.add(resultSet.getString("contact"));
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingDBExample::new);
    }
}
