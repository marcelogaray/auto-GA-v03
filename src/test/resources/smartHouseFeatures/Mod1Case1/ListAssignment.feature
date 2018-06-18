Feature: Listar las asignaciones realizadas
  Background: El usuario ha sido logueado en el sistema
              Existe al menos una asignación realizada en el sistema
    Scenario: Listar asignaciones
      Given: Cuando el usuario selecciona la opcion 'Asignacion de equipos'
      Then: Se muestra la lista de equipos asignados al personal