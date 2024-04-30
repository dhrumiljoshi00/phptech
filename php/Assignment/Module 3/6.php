<?php

function printPattern($rows)
{
    for ($i = 1; $i <= $rows; $i++) {
        for ($j = 1; $j <= $rows; $j++) {
            if ($i == 1 || $i == $rows || $j == 1) {
                echo "*";
            } else {
                echo "&nbsp;&nbsp;&nbsp;&nbsp;";
            }
        }
        echo "<br>";
    }
}

$rows = 5; 
printPattern($rows);

?>
