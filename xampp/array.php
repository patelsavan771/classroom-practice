<?php
    $student = array("a", "b", "c");
    foreach($student as $k => $v) {
        print " $v .... $k <br>";
    }

    $arr = array("Savan" => 20,
                    "khush" => 21,
                    "nehal" => 22);

    print "<br>";
    foreach($arr as $name => $age) {
        print " Age of $name is $age <br>";
    }
    $c = sizeof($arr);
    print "$c"
?>