WITH RECURSIVE ECOLI_TREE(ID, PARENT_ID, DEPTH) AS (
    SELECT ID, PARENT_ID, 1
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL
    UNION ALL
    SELECT E.ID, E.PARENT_ID, ET.DEPTH + 1
    FROM ECOLI_DATA E
    INNER JOIN ECOLI_TREE ET ON E.PARENT_ID = ET.ID
)
SELECT COUNT(ET.ID) AS COUNT, ET.DEPTH AS GENERATION
FROM ECOLI_TREE ET
LEFT JOIN ECOLI_DATA E ON E.PARENT_ID = ET.ID
WHERE E.ID IS NULL
GROUP BY ET.DEPTH