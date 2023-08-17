def call() {
    return [
        choice(name: 'PARAMETER_NAME', choices: ['','DEV1', 'DEV2', 'DEV3'], description: 'Choose an option', choiceType: 'PT_SINGLE_SELECT'),
        // Add more choice parameters as needed
    ]
}