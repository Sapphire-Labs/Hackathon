# Generated by Django 3.0.8 on 2020-07-18 17:31

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('core', '0011_auto_20200718_1610'),
    ]

    operations = [
        migrations.AlterField(
            model_name='content',
            name='search_count',
            field=models.IntegerField(default=0),
        ),
    ]
