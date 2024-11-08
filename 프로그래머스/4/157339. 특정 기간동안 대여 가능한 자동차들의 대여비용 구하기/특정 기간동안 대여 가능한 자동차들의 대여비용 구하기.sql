SELECT C.CAR_ID, C.CAR_TYPE, C.DAILY_FEE*30*(1 - D.DISCOUNT_RATE/100) AS FEE
FROM CAR_RENTAL_COMPANY_CAR C
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN D
ON C.CAR_TYPE = D.CAR_TYPE
AND D.DURATION_TYPE = '30일 이상'
WHERE C.CAR_TYPE IN ('세단', 'SUV')
    AND C.DAILY_FEE*30*(1 - D.DISCOUNT_RATE/100) BETWEEN 500000 AND 2000000
    AND NOT EXISTS(
            SELECT 1
            FROM  CAR_RENTAL_COMPANY_RENTAL_HISTORY H
            WHERE H.CAR_ID = C.CAR_ID
            AND H.START_DATE <= TO_DATE('2022-11-30', 'YYYY-MM-DD') 
            AND H.END_DATE >= TO_DATE('2022-11-01', 'YYYY-MM-DD')
    )
ORDER BY 
    FEE DESC, 
    C.CAR_TYPE, 
    C.CAR_ID DESC
