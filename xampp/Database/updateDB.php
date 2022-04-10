<?php
    $dbhost = "localhost";
    $user = "root";
    $pass = "";
    $dbname = "mydb";

    $conn = mysqli_connect($dbhost, $user, $pass, $dbname);

    if(!$conn) {
        die("Cannot connect to DB.<br>".mysqli_error($conn));
    }
    echo "Connected.";

    $q = "update student set age = 21 where id = 1";

    $ret = mysqli_query($conn, $q);

    if(!$ret) {
        die("cannot fire query".mysqli_error($conn));
    }
    echo "query fired successfully.";


?>