# Maven + Dependencias + Validación de Expresiones + Ofuscación

Este repositorio contiene la resolución de la tarea de Estructuras de Datos, implementando un entorno multi-proyecto con **Maven**, una estructura de **Pila (Stack)** creada desde cero usando Nodos, validación de expresiones algebraicas, y técnicas de ofuscación e ingeniería inversa.

## 📁 Estructura del Repositorio

El repositorio está dividido en los siguientes directorios obligatorios:

* `/umg.edu.gt.data-structure.stack`: Proyecto Maven A (Librería). Contiene la implementación manual de la Pila (`MyStack`) y sus Nodos.
* `/stackHandler`: Proyecto Maven B (Aplicación). Consume la librería anterior y contiene la lógica de validación de expresiones (`SymbolValidator`).
* `/evidencias`: Contiene las capturas de pantalla de la ejecución en consola, pruebas de regresión y análisis de ingeniería inversa.

---

## 🚀 Instrucciones de Compilación y Ejecución

Todo el proyecto está diseñado para compilarse y ejecutarse estrictamente desde **consola**.

### 1. Instalar la Librería (Proyecto A)
Es obligatorio instalar primero la librería en el repositorio local (`.m2`) para que el handler pueda consumirla.
```bash
cd umg.edu.gt.data-structure.stack
mvn clean install
