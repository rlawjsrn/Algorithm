SELECT REST_INFO.FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM REST_INFO
WHERE FAVORITES = (
    SELECT MAX(FAVORITES)
    FROM REST_INFO R
    WHERE R.FOOD_TYPE = REST_INFO.FOOD_TYPE
)
ORDER BY FOOD_TYPE DESC
