
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import MenuView from "./components/MenuView"
import MenuViewDetail from "./components/MenuViewDetail"
import OrderHistroryView from "./components/OrderHistroryView"
import OrderHistroryViewDetail from "./components/OrderHistroryViewDetail"
import StoreMgmtManager from "./components/listers/StoreMgmtCards"
import StoreMgmtDetail from "./components/listers/StoreMgmtDetail"

import OrderInfoView from "./components/OrderInfoView"
import OrderInfoViewDetail from "./components/OrderInfoViewDetail"
import PayManager from "./components/listers/PayCards"
import PayDetail from "./components/listers/PayDetail"

import PayMgmtManager from "./components/listers/PayMgmtCards"
import PayMgmtDetail from "./components/listers/PayMgmtDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/menus',
                name: 'MenuView',
                component: MenuView
            },
            {
                path: '/menus/:id',
                name: 'MenuViewDetail',
                component: MenuViewDetail
            },
            {
                path: '/orderHistrories',
                name: 'OrderHistroryView',
                component: OrderHistroryView
            },
            {
                path: '/orderHistrories/:id',
                name: 'OrderHistroryViewDetail',
                component: OrderHistroryViewDetail
            },
            {
                path: '/storeMgmts',
                name: 'StoreMgmtManager',
                component: StoreMgmtManager
            },
            {
                path: '/storeMgmts/:id',
                name: 'StoreMgmtDetail',
                component: StoreMgmtDetail
            },

            {
                path: '/orderInfos',
                name: 'OrderInfoView',
                component: OrderInfoView
            },
            {
                path: '/orderInfos/:id',
                name: 'OrderInfoViewDetail',
                component: OrderInfoViewDetail
            },
            {
                path: '/pays',
                name: 'PayManager',
                component: PayManager
            },
            {
                path: '/pays/:id',
                name: 'PayDetail',
                component: PayDetail
            },

            {
                path: '/payMgmts',
                name: 'PayMgmtManager',
                component: PayMgmtManager
            },
            {
                path: '/payMgmts/:id',
                name: 'PayMgmtDetail',
                component: PayMgmtDetail
            },



    ]
})
