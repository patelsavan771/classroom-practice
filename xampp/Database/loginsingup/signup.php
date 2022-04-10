<?php
    $username = $_GET["username"];
    $password = $_GET["password"];
    $fname = $_GET["fname"];

    $dbhost = "localhost";
    $user = "root";
    $pass = "";
    $dbname = "test";

    $conn = mysqli_connect($dbhost, $user, $pass, $dbname);

    if(!$conn) {
        die("Cannot connect to DB.<br>".mysqli_error($conn));
    }
    // echo "Connected.";

    $q = "insert into log values ('".$fname."', '".$username."' ,'".$password."')";

    $ret = mysqli_query($conn, $q);

    if(!$ret) {
        die("cannot fire query".mysqli_error($conn));
    }
    echo "signed up successfully.";


?>