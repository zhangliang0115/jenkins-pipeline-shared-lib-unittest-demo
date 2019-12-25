def call(Map config) {
    node {
        mail to: 'zhangliang0115@126.com', subject: "${config.name} plugin build", body: "...${config.body}"
    }
}