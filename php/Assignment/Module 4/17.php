index.html

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Hotel Room Booking</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="script.js"></script>
</head>
<body>
<h2>Hotel Room Booking</h2>
<select id="bookingType">
  <option value="full_day">Full Day</option>
  <option value="half_day">Half Day</option>
  <option value="custom">Custom</option>
</select>
<div id="bookingOptions">
  <!-- Dynamic content will be loaded here -->
</div>
<button id="bookButton">Book Room</button>
<div id="message"></div>
</body>
</html>

script.js

$(document).ready(function(){
  $('#bookingType').change(function(){
    var bookingType = $(this).val();
    $.ajax({
      url: 'getBookingOptions.php',
      method: 'POST',
      data: { bookingType: bookingType },
      dataType: 'json',
      success: function(response){
        $('#bookingOptions').html(response.html);
      }
    });
  });

  $('#bookButton').click(function(){
    var formData = {
      bookingType: $('#bookingType').val(),
      date: $('#date').val(),
      slot: $('#slot').val()
    };
    $.ajax({
      url: 'bookRoom.php',
      method: 'POST',
      data: formData,
      dataType: 'json',
      success: function(response){
        $('#message').html(response.message);
      }
    });
  });
});

getBookingOptions.php

<?php
$bookingType = $_POST['bookingType'];
$html = '';

if ($bookingType === 'full_day') {
    $html = '<label for="date">Date:</label><input type="date" id="date" required>';
} elseif ($bookingType === 'half_day') {
    $html = '<label for="date">Date:</label><input type="date" id="date" required><br>';
    $html .= '<label for="slot">Slot:</label>';
    $html .= '<select id="slot" required>';
    $html .= '<option value="morning">Morning (8AM to 6PM)</option>';
    $html .= '<option value="evening">Evening (7PM to 7AM)</option>';
    $html .= '</select>';
} elseif ($bookingType === 'custom') {
    $html = '<label for="date">Date:</label><input type="date" id="date" required>';
}

echo json_encode(['html' => $html]);
?>

bookRoom.php

<?php
// Perform booking validation and processing here
$bookingType = $_POST['bookingType'];
$date = $_POST['date'];
$slot = isset($_POST['slot']) ? $_POST['slot'] : '';

// Perform booking validation and processing
$message = "Booking successful for $bookingType on $date";
if ($bookingType === 'half_day') {
    $message .= " for $slot";
}

echo json_encode(['message' => $message]);
?>





