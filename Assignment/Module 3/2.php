<?php


function isLeapYear($year) {
    if ($year % 4 == 0) {
        if ($year % 100 == 0) {
            if ($year % 400 == 0) {
                return true; 
            } else {
                return false; 
            }
        } else {
            return true; 
        }
    } else {
        return false; 
    }
}

echo "Leap years between 1901 and 2024:\n";
for ($year = 1901; $year <= 2024; $year++) {
    if (isLeapYear($year)) {
        echo $year . "\n";
    }
}

?>
