-- 코드를 입력하세요
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE, '%Y-%m-%d') as OUT_DATE, 
if (DATE_FORMAT(OUT_DATE, '%Y-%m-%d') <= '2022-05-01', '출고완료', 
    (if (DATE_FORMAT(OUT_DATE, '%Y-%m-%d') > '2022-05-01', '출고대기', 
         '출고미정')))
as '출고여부'
from FOOD_ORDER
order by ORDER_ID
;