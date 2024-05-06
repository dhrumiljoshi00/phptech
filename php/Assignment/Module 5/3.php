<?php
// Check if the request method is POST
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Check if the request contains a file
    if (isset($_FILES['image'])) {
        $uploadDir = 'uploads/'; // Directory where the uploaded images will be stored
        $uploadFile = $uploadDir . basename($_FILES['image']['name']);

        // Check if the file is an image
        $imageFileType = strtolower(pathinfo($uploadFile, PATHINFO_EXTENSION));
        $allowedExtensions = array('jpg', 'jpeg', 'png', 'gif');
        if (!in_array($imageFileType, $allowedExtensions)) {
            http_response_code(400);
            echo json_encode(array('error' => 'Invalid file format. Only JPG, JPEG, PNG, and GIF files are allowed.'));
            exit;
        }

        // Move the uploaded file to the upload directory
        if (move_uploaded_file($_FILES['image']['tmp_name'], $uploadFile)) {
            // File uploaded successfully
            echo json_encode(array('message' => 'File uploaded successfully.', 'file_path' => $uploadFile));
        } else {
            http_response_code(500);
            echo json_encode(array('error' => 'Failed to upload file.'));
        }
    } else {
        http_response_code(400);
        echo json_encode(array('error' => 'No file uploaded.'));
    }
} else {
    http_response_code(405);
    echo json_encode(array('error' => 'Method Not Allowed'));
}
?>
