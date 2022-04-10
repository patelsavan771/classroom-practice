<?php
    $fname = $_GET["fname"];
    $lname = $_GET["lname"];
    $city = $_GET["city"];
    $age = $_GET["age"];

    $dbhost = "localhost";
    $user = "root";
    $pass = "";
    $dbname = "mydb";

    $conn = mysqli_connect($dbhost, $user, $pass, $dbname);

    if(!$conn) {
        die("Cannot connect to DB.<br>".mysqli_error($conn));
    }
    echo "Connected.";

    $q = "insert into myt values ('".$fname."', '".$lname."' ,'".$city."' ,".$age.")";

    $ret = mysqli_query($conn, $q);

    if(!$ret) {
        die("cannot fire query".mysqli_error($conn));
    }
    echo "registered successfully.";


?>