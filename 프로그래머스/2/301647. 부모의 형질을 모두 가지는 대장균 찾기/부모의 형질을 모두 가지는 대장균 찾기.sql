SELECT C.ID, C.GENOTYPE, P.GENOTYPE AS PARENT_GENOTYPE
FROM ECOLI_DATA C 
JOIN ECOLI_DATA P ON C.PARENT_ID = P.ID
WHERE C.PARENT_ID IS NOT NULL
AND (C.GENOTYPE & P.GENOTYPE) = P.GENOTYPE
ORDER BY C.ID