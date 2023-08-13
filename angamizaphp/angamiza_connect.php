<?php


$servername = "localhost";
$username = "id20318309_testdbuser";
$password = "4dbUser@123";
$database = "id20318309_testdb";



$conn = new mysqli($servername, $username, $password, $database);


if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
