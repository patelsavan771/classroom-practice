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

    $q = "select * from student order by id desc";

    $ret = mysqli_query($conn, $q);

    if(!$ret) {
        die("cannot fire query".mysqli_error($conn));
    }
    echo "query fired successfully.";
    print "<table border = '1' width='30%'>";
    print "<tr>";

        print "<th>id</th>";
        print "<th>name</th>";
        print "<th>age</th>";

        print "</tr>";
    while($r = mysqli_fetch_assoc($ret)) {
        print "<tr>";

        print "<td>{$r['id']}</td>";
        print "<td>{$r['name']}</td>";
        print "<td>{$r['age']}</td>";

        print "</tr>";
    }
    print "</table>";

?>