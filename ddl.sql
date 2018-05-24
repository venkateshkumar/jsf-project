CREATE TABLE `sai_demo`.`employee` (
  `emp_id` INT NOT NULL,
  `emp_name` VARCHAR(45) NULL,
  `emp_address` VARCHAR(45) NULL,
  `emp_dept_id` INT NULL,
  PRIMARY KEY (`emp_id`));
CREATE TABLE `sai_demo`.`department` (
  `id` INT NOT NULL,
  `department_name` VARCHAR(45) NULL,
  `department_desc` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `sai_demo`.`employee` 
ADD INDEX `emp_dept_id_idx` (`emp_dept_id` ASC);
ALTER TABLE `sai_demo`.`employee` 
ADD CONSTRAINT `emp_dept_id`
  FOREIGN KEY (`emp_dept_id`)
  REFERENCES `sai_demo`.`department` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

CREATE TABLE sai_demo.department` (
id INT NOT NULL ,department_desc VARCHAR(45) NULL,department_name VARCHAR(45) NULL);