<?php

// Simulated database storage
$users = [];

// Endpoint for user registration
function registerUser($username, $password) {
    global $users;
    
    if (isset($users[$username])) {
        return ["success" => false, "message" => "Username already exists"];
    }
    
    $users[$username] = password_hash($password, PASSWORD_DEFAULT);
    
    return ["success" => true, "message" => "User registered successfully"];
}

// Endpoint for user login
function loginUser($username, $password) {
    global $users;
    
    if (!isset($users[$username])) {
        return ["success" => false, "message" => "User not found"];
    }
    
    if (password_verify($password, $users[$username])) {
        return ["success" => true, "message" => "Login successful"];
    } else {
        return ["success" => false, "message" => "Incorrect password"];
    }
}

// Sample usage
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Assuming JSON input
    $data = json_decode(file_get_contents('php://input'), true);
    
    if ($_GET['action'] === 'register') {
        $result = registerUser($data['username'], $data['password']);
    } elseif ($_GET['action'] === 'login') {
        $result = loginUser($data['username'], $data['password']);
    }
    
    header('Content-Type: application/json');
    echo json_encode($result);
} else {
    // Handle unsupported HTTP methods
    http_response_code(405);
    echo "Method Not Allowed";
}
?>
