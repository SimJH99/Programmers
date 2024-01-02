-- 코드를 입력하세요
SELECT i.ANIMAL_ID, i.ANIMAL_TYPE, i.NAME
from ANIMAL_INS i left join ANIMAL_OUTS o
on i.ANIMAL_ID = o.ANIMAL_ID
where i.SEX_UPON_INTAKE like "%Intact%" And (o.SEX_UPON_OUTCOME like "%Spayed%" OR o.SEX_UPON_OUTCOME like "%Neutered%")
order by ANIMAL_ID;
