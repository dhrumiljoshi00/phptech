import React, { useState } from 'react';

const TableSearch = () => {
  // Sample data for the table
  const data = [
    { id: 1, name: 'John Doe', age: 30 },
    { id: 2, name: 'Jane Smith', age: 25 },
    { id: 3, name: 'Mike Johnson', age: 35 },
    { id: 4, name: 'Emily Davis', age: 28 },
    { id: 5, name: 'David Brown', age: 40 }
  ];

  const [searchTerm, setSearchTerm] = useState('');
  
  // Function to handle search term change
  const handleSearchTermChange = (e) => {
    setSearchTerm(e.target.value);
  };

  // Filter data based on search term
  const filteredData = data.filter(item =>
    item.name.toLowerCase().includes(searchTerm.toLowerCase())
  );

  return (
    <div>
      <input
        type="text"
        placeholder="Search by name..."
        value={searchTerm}
        onChange={handleSearchTermChange}
      />
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
          </tr>
        </thead>
        <tbody>
          {filteredData.map(item => (
            <tr key={item.id}>
              <td>{item.id}</td>
              <td>{item.name}</td>
              <td>{item.age}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default TableSearch;
