# Mejora de Seguridad y Legibilidad en Aplicación de Pagos

La aplicación de pagos de nuestra fintech ha crecido rápidamente, pero su autenticación es improvisada y la configuración está dispersa. Necesitamos un especialista en frameworks que mejore la seguridad y legibilidad del código. La aplicación actualmente maneja un volumen de 10 000 transacciones por hora y tiene una tasa de error del 0.5%.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Especialista en Framework con Proficiencia en Seguridad y Legibilidad de Código |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3h30m |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Diagnóstico de la Aplicación Actual

**Objetivo:** Identificar puntos de mejora en la autenticación y configuración de la aplicación.

**Tiempo estimado:** 45m

**Instrucciones:**

- Analiza la autenticación actual y la dispersión de la configuración.
- Identifica al menos dos mecanismos de autenticación que se pueden implementar.
- Enumera las configuraciones que deben ser centralizadas.

**Entregable:** Reporte de diagnóstico con puntos de mejora identificados.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los tipos de autenticación que el framework puede ofrecer.
- Piensa en cómo la centralización de la configuración puede mejorar la legibilidad del código.

</details>

### Fase 2: Implementación de Mecanismos de Autenticación

**Objetivo:** Implementar dos mecanismos de autenticación utilizando el framework.

**Tiempo estimado:** 1h

**Instrucciones:**

- Selecciona dos mecanismos de autenticación del framework y impleméntalos en la aplicación.
- Asegura que la implementación sea segura y que el código sea legible.

**Entregable:** Aplicación con dos mecanismos de autenticación implementados.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la seguridad y la legibilidad del código son cruciales.
- Piensa en cómo el framework puede ayudarte a lograr estos objetivos.

</details>

### Fase 3: Centralización de la Configuración

**Objetivo:** Centralizar la configuración de la aplicación para mejorar la legibilidad del código.

**Tiempo estimado:** 1h

**Instrucciones:**

- Identifica todas las configuraciones dispersas en la aplicación.
- Centraliza estas configuraciones en un único lugar.
- Asegura que la centralización no afecte la funcionalidad de la aplicación.

**Entregable:** Aplicación con configuración centralizada.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo la centralización de la configuración puede facilitar el mantenimiento del código.
- Asegúrate de que la centralización no introduzca nuevos errores en la aplicación.

</details>

### Fase 4: Revisión y Mejora Continua

**Objetivo:** Revisar el trabajo realizado y proponer mejoras continuas.

**Tiempo estimado:** 45m

**Instrucciones:**

- Revisa el trabajo realizado en las fases anteriores.
- Identifica áreas de mejora y propone soluciones.
- Implementa las mejoras propuestas y verifica que no introducen nuevos errores.

**Entregable:** Aplicación mejorada con propuestas de mejora implementadas.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo puedes mejorar aún más la seguridad y legibilidad del código.
- Asegúrate de que las mejoras no afecten la funcionalidad de la aplicación.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los mecanismos de autenticación y cómo se implementan en un framework?
- **paraQueSirve**: ¿Para qué sirve la centralización de la configuración en una aplicación?
- **comoSeUsa**: ¿Cómo se usa un framework para mejorar la seguridad y legibilidad del código?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar mecanismos de autenticación y centralizar la configuración?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de mecanismos de autenticación y la centralización de la configuración?

## Criterios de Evaluacion

- Identificación de puntos de mejora en la autenticación y configuración de la aplicación.
- Implementación de dos mecanismos de autenticación utilizando el framework.
- Centralización de la configuración de la aplicación para mejorar la legibilidad del código.
- Propuesta y implementación de mejoras continuas.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT). Devuelve un ZIP con el proyecto. Sirve si no tenes un agente en el IDE.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn clean compile
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
