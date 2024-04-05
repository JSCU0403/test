SELECT  ORDER_ID,
        PRODUCT_ID,
        to_char(OUT_DATE,'YYYY-MM-DD'),
        CASE WHEN to_char(OUT_DATE,'YYYYMMDD') > '20220501' THEN '출고대기' 
            WHEN to_char(OUT_DATE,'YYYYMMDD') <= '20220501' THEN '출고완료' 
            else '출고미정' 
        end as "출고여부"
FROM FOOD_ORDER
ORDER BY ORDER_ID