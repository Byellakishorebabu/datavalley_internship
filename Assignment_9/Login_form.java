<!DOCTYPE html>
<html>
<head>
<title>Departmental Store Customer Form</title>
</head>
<body>

<h2>Customer Information Form</h2>

<form action="/submit" method="post">
  <label for="name">Name:</label><br>
  <input type="text" id="name" name="customer_name" required><br>

  <label for="phone">Contact Phone No:</label><br>
  <input type="tel" id="phone" name="customer_phone" required><br>

  <label for="days">Preferred Days of Purchasing:</label><br>
  <input type="text" id="days" name="purchase_days" required><br>

  <label for="item">Favourite Item:</label><br>
  <select id="item" name="favourite_item">
    <option value="item1">Item 1</option>
    <option value="item2">Item 2</option>
    <!-- Add more items as needed -->
  </select><br>

  <label for="suggestions">Suggestions:</label><br>
  <textarea id="suggestions" name="customer_suggestions" rows="4" cols="50"></textarea><br>

  <input type="submit" value="Submit">
  <input type="reset" value="Reset">
</form>

</body>
</html>
