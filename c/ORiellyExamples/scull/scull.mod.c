#include <linux/module.h>
#include <linux/vermagic.h>
#include <linux/compiler.h>

MODULE_INFO(vermagic, VERMAGIC_STRING);

struct module __this_module
__attribute__((section(".gnu.linkonce.this_module"))) = {
 .name = KBUILD_MODNAME,
 .init = init_module,
#ifdef CONFIG_MODULE_UNLOAD
 .exit = cleanup_module,
#endif
 .arch = MODULE_ARCH_INIT,
};

static const struct modversion_info ____versions[]
__attribute_used__
__attribute__((section("__versions"))) = {
	{ 0xa024e4b1, "struct_module" },
	{ 0xa5423cc4, "param_get_int" },
	{ 0xcb32da10, "param_set_int" },
	{ 0x2f287f0d, "copy_to_user" },
	{ 0x60a4461c, "__up_wakeup" },
	{ 0xd6c963c, "copy_from_user" },
	{ 0x625acc81, "__down_failed_interruptible" },
	{ 0xda4008e6, "cond_resched" },
	{ 0x9cf3938c, "cdev_add" },
	{ 0xeeeefcf, "cdev_init" },
	{ 0xffd3c7, "init_waitqueue_head" },
	{ 0x12da5bb2, "__kmalloc" },
	{ 0x1b7d4074, "printk" },
	{ 0x29537c9e, "alloc_chrdev_region" },
	{ 0xd8e484f0, "register_chrdev_region" },
	{ 0x7485e15e, "unregister_chrdev_region" },
	{ 0xc82e262c, "cdev_del" },
	{ 0x37a0cba, "kfree" },
	{ 0xfb306753, "kmem_cache_alloc" },
	{ 0xab807860, "kmalloc_caches" },
};

static const char __module_depends[]
__attribute_used__
__attribute__((section(".modinfo"))) =
"depends=";


MODULE_INFO(srcversion, "80E55F6AB95D370C7ED6411");
