# Generated by Django 2.0 on 2018-02-21 05:27

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('carts', '0001_initial'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='cart',
            name='taxtotal',
        ),
    ]