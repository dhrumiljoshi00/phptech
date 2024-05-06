UserController.php

<?php

class UserController {
    public function getAllUsers() {
        // Fetch all users from the database
        // Example: $users = User::getAll();

        // Convert the users array to JSON format
        $users = []; // replace this with actual data
        echo json_encode($users);
    }

    public function getUserById($id) {
        // Fetch user from the database by ID
        // Example: $user = User::getById($id);

        // Convert the user object to JSON format
        $user = []; // replace this with actual data
        echo json_encode($user);
    }

    public function createUser() {
        // Extract user data from the request
        $data = json_decode(file_get_contents('php://input'), true);

        // Validate and save the user data to the database
        // Example: $user = new User($data);
        //          $user->save();

        // Return a success message
        echo json_encode(['message' => 'User created successfully']);
    }

    public function updateUser($id) {
        // Extract user data from the request
        $data = json_decode(file_get_contents('php://input'), true);

        // Update user in the database
        // Example: $user = User::getById($id);
        //          $user->update($data);

        // Return a success message
        echo json_encode(['message' => 'User updated successfully']);
    }

    public function deleteUser($id) {
        // Delete user from the database
        // Example: $user = User::getById($id);
        //          $user->delete();

        // Return a success message
        echo json_encode(['message' => 'User deleted successfully']);
    }
}
?>

index.php

<?php

// Include the controller
require_once 'UserController.php';

// Define routes
$route = $_GET['route'] ?? '';

// Route the request
switch ($route) {
    case 'users':
        $controller = new UserController();
        if ($_SERVER['REQUEST_METHOD'] === 'GET') {
            $controller->getAllUsers();
        } elseif ($_SERVER['REQUEST_METHOD'] === 'POST') {
            $controller->createUser();
        }
        break;
    case 'users/id':
        // Extract user id from the URL
        $userId = isset($_GET['id']) ? $_GET['id'] : null;
        $controller = new UserController();
        if ($_SERVER['REQUEST_METHOD'] === 'GET') {
            $controller->getUserById($userId);
        } elseif ($_SERVER['REQUEST_METHOD'] === 'PUT') {
            $controller->updateUser($userId);
        } elseif ($_SERVER['REQUEST_METHOD'] === 'DELETE') {
            $controller->deleteUser($userId);
        }
        break;
    default:
        http_response_code(404);
        echo json_encode(['error' => 'Not Found']);
        break;
}
?>
