.class Ltb/d$b;
.super Ltb/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Ltb/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Landroid/text/TextPaint;

.field final synthetic c:Ltb/f;

.field final synthetic d:Ltb/d;


# direct methods
.method constructor <init>(Ltb/d;Landroid/content/Context;Landroid/text/TextPaint;Ltb/f;)V
    .locals 0

    iput-object p1, p0, Ltb/d$b;->d:Ltb/d;

    iput-object p2, p0, Ltb/d$b;->a:Landroid/content/Context;

    iput-object p3, p0, Ltb/d$b;->b:Landroid/text/TextPaint;

    iput-object p4, p0, Ltb/d$b;->c:Ltb/f;

    invoke-direct {p0}, Ltb/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Ltb/d$b;->c:Ltb/f;

    invoke-virtual {v0, p1}, Ltb/f;->a(I)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Ltb/d$b;->d:Ltb/d;

    .line 2
    .line 3
    iget-object v1, p0, Ltb/d$b;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Ltb/d$b;->b:Landroid/text/TextPaint;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2, p1}, Ltb/d;->p(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ltb/d$b;->c:Ltb/f;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Ltb/f;->b(Landroid/graphics/Typeface;Z)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method
