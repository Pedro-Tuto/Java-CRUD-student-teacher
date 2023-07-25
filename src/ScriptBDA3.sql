-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_alunos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_alunos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_alunos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `db_alunos` ;

-- -----------------------------------------------------
-- Table `db_alunos`.`tb_alunos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_alunos`.`tb_alunos` (
  `id` INT NOT NULL,
  `nome` VARCHAR(250) NULL DEFAULT NULL,
  `idade` INT NULL DEFAULT NULL,
  `curso` VARCHAR(45) NULL DEFAULT NULL,
  `fase` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_alunos`.`tb_professores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_alunos`.`tb_professores` (
  `id` INT NOT NULL,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `idade` INT NULL DEFAULT NULL,
  `formacao` VARCHAR(255) NULL DEFAULT NULL,
  `capacitacao` VARCHAR(255) NULL DEFAULT NULL,
  `salario` DOUBLE NULL DEFAULT NULL,
  `numero_turmas` INT NULL DEFAULT NULL,
  `turno` VARCHAR(100) NULL DEFAULT NULL,
  `meses_servico` INT NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `telefone` VARCHAR(45) NULL DEFAULT NULL,
  `aulas_lecionadas` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

