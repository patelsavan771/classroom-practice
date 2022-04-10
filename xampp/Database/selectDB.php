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

    $q = "select * from student";

    $ret = mysqli_query($conn, $q);

    if(!$ret) {
        die("cannot fire query".mysqli_error($conn));
    }
    echo "query fired successfully.";
    while($r = mysqli_fetch_assoc($ret)) {
        print "ID : {$r['id']}";
        print "Name : {$r['name']}";
        print "Age : {$r['age']}";
    }


?>