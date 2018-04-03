%{--
  This needs as input attribute:
  calculatorInstance
  name : for id, name, error indication
  label
--}%


<%@ page import="static mvc.FieldUtil.*" %>

<div>
  <label for="${name}">${label}</label>
  <input type="number decimal" name="${name}"
         value="${calculatorInstance.getProperty(name)}"
         required="true" min="1.0" max="6.0" id="${name}"
         class="${hasError(calculatorInstance, name) ? 'error' : ''}"
         title="${g.message(error: findError(calculatorInstance, name)) }"
         onchange="validate(this)"
  />
</div>