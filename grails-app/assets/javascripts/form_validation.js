// Validating an input field that accepts numerical values between 1.0 and 6.0

function validate(inputField) {
    if (inputField.value < 1.0) {
        handledError(inputField, ' value needs to be at least 1.0' );
        return;
    }
    if (inputField.value > 6.0) {
        handledError(inputField, ' value needs to be at most 6.0' );
        return;
    }
    inputField.setAttribute('class','');
}

function handledError(inputField, msg) {
    inputField.setAttribute('class', 'error');
    inputField.focus();
}
