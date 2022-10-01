/** @type {import('tailwindcss').Config} */
module.exports = {
    content: process.env.NODE_ENV == 'production' ? // Faster build for dev environment.
        ["./resources/public/js/compiled/app.js"] : ["./resources/public/js/compiled/cljs-runtime/*.js"],
    theme: {
        extend: {
            colors: {
                'todoist-primary': '#e44332'
            }
        },
    },
    plugins: [],
}
