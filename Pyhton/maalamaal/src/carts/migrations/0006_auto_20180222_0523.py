# Generated by Django 2.0 on 2018-02-22 05:23

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('carts', '0005_auto_20180221_0537'),
    ]

    operations = [
        migrations.RenameField(
            model_name='cart',
            old_name='tax_Total',
            new_name='tax_total',
        ),
    ]