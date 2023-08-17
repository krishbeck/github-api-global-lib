def call() {
    return [
        choice(name: 'PARAMETER_NAME', choices: 'Option 1\nOption 2\nOption 3', description: 'Choose an option'),
        // Add more choice parameters as needed
    ]
}