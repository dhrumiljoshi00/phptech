<?php


function calgrade($physics, $chemistry, $biology, $mathematics, $computer) {
    $totalMarks = $physics + $chemistry + $biology + $mathematics + $computer;
    $percentage = ($totalMarks / 500) * 100;

  
    if ($percentage >= 90) {
        $grade = 'A';
    } elseif ($percentage >= 80) {
        $grade = 'B';
    } elseif ($percentage >= 70) {
        $grade = 'C';
    } elseif ($percentage >= 60) {
        $grade = 'D';
    } elseif ($percentage >= 40) {
        $grade = 'E';
    } else {
        $grade = 'F';
    }

    return array('percentage' => $percentage, 'grade' => $grade);
}


$physics = 85;
$chemistry = 75;
$biology = 90;
$mathematics = 80;
$computer = 95;


$result = calgrade($physics, $chemistry, $biology, $mathematics, $computer);

echo "Percentage: " . $result['percentage'] . "%\n";
echo "Grade: " . $result['grade'] . "\n";

function findThur($day) {
    switch ($day) {
        case 0:
            return "Sunday";
            break;
        case 1:
            return "Monday";
            break;
        case 2:
            return "Tuesday";
            break;
        case 3:
            return "Wednesday";
            break;
        case 4:
            return "Thursday";
            break;
        case 5:
            return "Friday";
            break;
        case 6:
            return "Saturday";
            break;
        default:
            return "Invalid day";
    }
}

$day = 4; 
echo "Thursday is: " . findThur($day);
?>
