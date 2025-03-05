# SELECT COUNT(GENOTYPE) AS COUNT
# FROM(SELECT ID, CONV(GENOTYPE, 10, 2) AS GENOTYPE
#     FROM ECOLI_DATA
#     WHERE SUBSTRING(CONV(GENOTYPE, 10, 2), -2, 1) <> '1'
#     AND (SUBSTRING(CONV(GENOTYPE, 10, 2), -1, 1) = '1'
#     OR SUBSTRING(CONV(GENOTYPE, 10, 2), -3, 1) = '1')
#     ) AS GENOTYPE_FILTERED

SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA
WHERE GENOTYPE & 7 IN (1, 4, 5)