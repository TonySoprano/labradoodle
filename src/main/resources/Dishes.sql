-- input of restaurants
--INSERT INTO restaurants(id, address, close_time, email, name, open_time, phone) VALUES (1,'DNKDNKLNN','9:00','rest@i.ua','PIZZA_HOUSE','22:00','+38(097)852-65-14')
--INSERT INTO restaurants(id, address, close_time, email, name, open_time, phone) VALUES (2,'DNKDNKKMK','9:00','cafe@i.ua','BORSH_MENU','22:00','+38(063)412-03-87')

--  input of Dishes
INSERT INTO  dishes(id, deadline, name, price_new, price_original, types_of_dishes, restaurant_id) VALUES (1,'2015-12-20','pizza_delicious',150,300,0,1)
--INSERT INTO  dishes(id, deadline, name, price_new, price_original, types_of_dishes, restaurant_id) VALUES (2,'2015-12-22','cheezburger',30,70,2,1)
--INSERT INTO  dishes(id, deadline, name, price_new, price_original, types_of_dishes, restaurant_id) VALUES (3,'2015-11-19','pizza_cheez',70,150,0,2)
--INSERT INTO  dishes(id, deadline, name, price_new, price_original, types_of_dishes, restaurant_id) VALUES (4,'2015-11-20','huyaki_maki',120,280,4,2)


-- Input of dishes
INSERT INTO dishes(deadline,description,name,photo,price_new,price_original,types_of_dishes)
VALUES ('2015-10-11','Легкая пицца с осенними овощами (шампиньоны, помидоры, болгарский перец, баклажаны, лук, ароматный чеснок, сыр пармезан и моцарелла','Грация','/resources/img/pizza.jpg','100','120','0');

INSERT INTO dishes(deadline,description,name,photo,price_new,price_original,types_of_dishes)
VALUES ('2015-10-12','Пицца-соус, сыр "Моцарелла", ветчина, ананасы. Экзотический вкус!','Гавайская','/resources/img/pizza.jpg','130','150','0');

INSERT INTO dishes(deadline,description,name,photo,price_new,price_original,types_of_dishes)
VALUES ('2015-10-11','Вегетарианское блюдо. Постное Морские маринованные водоросли.','Чука','/resources/img/sushi.jpg','10','16','4');

INSERT INTO dishes(deadline,description,name,photo,price_new,price_original,types_of_dishes)
VALUES ('2015-10-11','Морской окунь','Тай','/resources/img/sushi.jpg','28','32','4');

INSERT INTO dishes(deadline,description,name,photo,price_new,price_original,types_of_dishes)
VALUES ('2015-10-11','Бургер, с двумя говяжими котлетами, сыром да овощами, с майонезно-каперсовым соусом, в салатном листе обернутый.','Бургер "Ковбойский"','/resources/img/burgers.jpg','130','168','2');

INSERT INTO dishes(deadline,description,name,photo,price_new,price_original,types_of_dishes)
VALUES ('2015-10-11','Котлета из свинины и говядины, нежный сыр, маринованный лучок и соленый огурчик.','Чизбургер','/resources/img/burgers.jpg','80','96','2');

INSERT INTO dishes(deadline,description,name,photo,price_new,price_original,types_of_dishes)
VALUES ('2015-10-11','Пресноводный угорь.','Унаги','/resources/img/fish.jpg','18','32','3');

INSERT INTO dishes(deadline,description,name,photo,price_new,price_original,types_of_dishes)
VALUES ('2015-10-11','Тунец','Магуро','/resources/img/fish.jpg','20','25','3');

INSERT INTO dishes(deadline,description,name,photo,price_new,price_original,types_of_dishes)
VALUES ('2015-10-11','Деревенская свинина, подрумяненная на чугунной сковороде, с лучком и зеленью.','Свинина "Хуторская" на сковороде','/resources/img/chine.jpg','100','128','1');

INSERT INTO dishes(deadline,description,name,photo,price_new,price_original,types_of_dishes)
VALUES ('2015-10-11','Отборная телячья вырезка, на углях сготовленная да облитая густой поливою "Джек Дениэлс".','Филей телячий "Джек Дэниэлс"е','/resources/img/chine.jpg','120','178','1');