-- 코드를 입력하세요
SELECT c.CAR_ID
from CAR_RENTAL_COMPANY_CAR c left join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on c.CAR_ID = h.CAR_ID
where c.CAR_TYPE = '세단' AND h.START_DATE > '2022-10-01'
group by c.CAR_ID
order by c.CAR_ID desc
