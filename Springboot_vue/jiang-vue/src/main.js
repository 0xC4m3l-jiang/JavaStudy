import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import store from './store'

// 这里的端口 在后面的跨域中设置
// 设置反向代理，前端请求默认发送到 http://localhost:8888/api
var axios = require('axios')
axios.defaults.baseURL = 'http://localhost:8888/api'
// 全局注册，之后可在其他组件中通过 this.$axios 发送数据
// 这里用到了 原型链的知识点 每个势力都存在一个 prototype
Vue.prototype.$axios = axios
Vue.config.productionTip = false

Vue.use(ElementUI)

router.beforeEach((to, from, next) => {
  if (to.meta.requireAuth) {
    if (store.state.user.username) {
      next()
    } else {
      next({
        path: 'login',
        query: {redirect: to.fullPath}
      })
    }
  } else {
    next()
  }
}
)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  render: h => h(App),
  router,
  store,
  components: { App },
  template: '<App/>'
})
