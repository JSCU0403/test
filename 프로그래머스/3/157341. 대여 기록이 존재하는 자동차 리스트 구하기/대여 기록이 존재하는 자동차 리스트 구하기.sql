-- 코드를 입력하세요
SELECT distinct C.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR C,CAR_RENTAL_COMPANY_RENTAL_HISTORY H
WHERE C.CAR_ID = H.CAR_ID AND CAR_TYPE like '세단' AND TO_CHAR(H.START_DATE,'MM') = 10
ORDER BY C.CAR_ID desc