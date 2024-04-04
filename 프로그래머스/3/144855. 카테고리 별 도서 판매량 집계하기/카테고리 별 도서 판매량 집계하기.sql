SELECT book.category,sum(sales) as total_sales
FROM BOOK_SALES
JOIN book
on book_sales.book_id = book.book_id
WHERE to_char(SALES_DATE,'YYYY-MM') like '2022-01'
GROUP BY book.category
ORDER BY book.category