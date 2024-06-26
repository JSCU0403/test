SELECT YEAR,MONTH*1 MONTH,GENDER,count(USER_ID) USERS
FROM  (
        SELECT DISTINCT
                    TO_CHAR(B.SALES_DATE, 'YYYY') YEAR
                    ,TO_CHAR(B.SALES_DATE, 'MM') MONTH
                    ,A.GENDER
                    ,A.USER_ID
            FROM USER_INFO A , ONLINE_SALE B
            WHERE 1=1
                  AND A.USER_ID = B.USER_ID
                  AND A.GENDER IS NOT NULL
            )
GROUP BY YEAR,MONTH,GENDER
ORDER BY YEAR,MONTH,GENDER