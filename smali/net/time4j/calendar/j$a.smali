.class final Lnet/time4j/calendar/j$a;
.super Lnet/time4j/calendar/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/time4j/calendar/j;->b(I)Lnet/time4j/calendar/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, Lnet/time4j/calendar/j$a;->a:I

    invoke-direct {p0}, Lnet/time4j/calendar/j;-><init>()V

    return-void
.end method


# virtual methods
.method public d()I
    .locals 2

    iget v0, p0, Lnet/time4j/calendar/j$a;->a:I

    const/16 v1, 0xa4c

    invoke-static {v0, v1}, Lnet/time4j/base/c;->e(II)I

    move-result v0

    return v0
.end method
