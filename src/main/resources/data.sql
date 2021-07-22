INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG')
INSERT INTO tb_user (name, email, password) VALUES ('Bob', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG')
INSERT INTO tb_user (name, email, password) VALUES ('Maria', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG')

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT')
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR')
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN')

INSERT INTO tb_user_roles (user_id, roles_id) VALUES (1, 1)
INSERT INTO tb_user_roles (user_id, roles_id) VALUES (2, 1)
INSERT INTO tb_user_roles (user_id, roles_id) VALUES (2, 2)
INSERT INTO tb_user_roles (user_id, roles_id) VALUES (3, 1)
INSERT INTO tb_user_roles (user_id, roles_id) VALUES (3, 2)
INSERT INTO tb_user_roles (user_id, roles_id) VALUES (3, 3)


INSERT INTO tb_course (name, img_uri, img_Gray_Uri) VALUES ('BootCamp Kotlin', 'https://cdn.pixabay.com/photo/2018/02/27/10/49/training-3185170_1280.jpg', 'https://thumbs.dreamstime.com/b/s%C3%ADmbolo-da-bagagem-do-curso-trouxa-em-preto-e-branco-projeto-gr-fico-ilustra-o-vetor-s-mbolo-145174811.jpg')


INSERT INTO tb_offer (edition, star_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2021-12-13T03:00:00.12345Z', TIMESTAMP WITH TIME ZONE '2022-12-13T03:00:00.12345Z', 1)
INSERT INTO tb_offer (edition, star_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2021-12-13T03:00:00.12345Z', TIMESTAMP WITH TIME ZONE '2022-12-13T03:00:00.12345Z', 1)


INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Trilha html', 'Trilha principal do curso', 1, 'https://cdn.pixabay.com/photo/2018/02/27/10/49/training-3185170_1280.jpg', 1, 1)
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Forum', 'Tire suas duvidas', 2, 'https://cdn.pixabay.com/photo/2018/02/27/10/49/training-3185170_1280.jpg', 2, 1)
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Lives', 'Lives exclusivas para a turma', 3, 'https://cdn.pixabay.com/photo/2018/02/27/10/49/training-3185170_1280.jpg', 0, 1)
