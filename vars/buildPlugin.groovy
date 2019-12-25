def call(Map config) {
    node {
        mail to: '...', subject: "${config.name} plugin build", body: '...'
    }
}