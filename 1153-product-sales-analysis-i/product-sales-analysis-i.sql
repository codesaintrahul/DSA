# Write your MySQL query statement below
SELECT product_name,year,price FROM Sales INNER JOIN Product ON Sales.Product_id=Product.product_id;