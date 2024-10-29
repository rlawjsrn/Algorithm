SELECT M.MEMBER_NAME, R.REVIEW_TEXT, TO_CHAR(R.REVIEW_DATE, 'YYYY-MM-DD')
FROM MEMBER_PROFILE M JOIN REST_REVIEW R
ON (M.MEMBER_ID = R.MEMBER_ID)
WHERE R.MEMBER_ID IN (SELECT MEMBER_ID
                        FROM REST_REVIEW
                        GROUP BY MEMBER_ID
                        HAVING COUNT(*) = (SELECT MAX(COUNT(*)) CO
                                            FROM REST_REVIEW
                                            GROUP BY MEMBER_ID))
ORDER BY REVIEW_DATE, REVIEW_TEXT;