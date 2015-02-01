SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `high_school` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

CREATE TABLE IF NOT EXISTS `high_school`.`student` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `registration_number` INT(11) NOT NULL,
  `birthday` DATE NOT NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;

CREATE TABLE IF NOT EXISTS `high_school`.`teacher` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `Last_name` VARCHAR(45) NOT NULL,
  `birthday` DATE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;

CREATE TABLE IF NOT EXISTS `high_school`.`course` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `teacher_id` INT(11) NULL DEFAULT NULL,
  `name` VARCHAR(45) NOT NULL,
  `hours_per_week` DOUBLE NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_course_teacher1_idx` (`teacher_id` ASC),
  CONSTRAINT `fk_course_teacher1`
    FOREIGN KEY (`teacher_id`)
    REFERENCES `high_school`.`teacher` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;

CREATE TABLE IF NOT EXISTS `high_school`.`student_course` (
  `student_id` INT(11) NOT NULL,
  `course_id` INT(11) NOT NULL,
  `note1` DOUBLE NOT NULL,
  `note2` DOUBLE NOT NULL,
  `note3` DOUBLE NOT NULL,
  `finalnote` DOUBLE NOT NULL,
  INDEX `student_id_idx` (`student_id` ASC),
  INDEX `course_id_idx` (`course_id` ASC),
  PRIMARY KEY (`student_id`, `course_id`),
  CONSTRAINT `student_id`
    FOREIGN KEY (`student_id`)
    REFERENCES `high_school`.`student` (`Id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `course_id`
    FOREIGN KEY (`course_id`)
    REFERENCES `high_school`.`course` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;

CREATE TABLE IF NOT EXISTS `high_school`.`schedule` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `day` ENUM('Sunday', 'Monday', 'Tuesday','Wednesday','Thursday','Friday','Saturday') NOT NULL,
  `start_hour` TIME NOT NULL,
  `finish_hour` TIME NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;

CREATE TABLE IF NOT EXISTS `high_school`.`course_schedule` (
  `course_id1` INT(11) NOT NULL,
  `schedule_id` INT(11) NOT NULL,
  PRIMARY KEY (`course_id1`, `schedule_id`),
  INDEX `schedule_id_idx` (`schedule_id` ASC),
  CONSTRAINT `fk_course_id`
    FOREIGN KEY (`course_id1`)
    REFERENCES `high_school`.`course` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `schedule_id`
    FOREIGN KEY (`schedule_id`)
    REFERENCES `high_school`.`schedule` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
