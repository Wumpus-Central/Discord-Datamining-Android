.class Lnet/time4j/calendar/c$a;
.super Lnet/time4j/calendar/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/time4j/calendar/c;->o(I)Lnet/time4j/calendar/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lnet/time4j/calendar/c;


# direct methods
.method constructor <init>(Lnet/time4j/calendar/c;I)V
    .locals 0

    iput-object p1, p0, Lnet/time4j/calendar/c$a;->b:Lnet/time4j/calendar/c;

    iput p2, p0, Lnet/time4j/calendar/c$a;->a:I

    invoke-direct {p0}, Lnet/time4j/calendar/j;-><init>()V

    return-void
.end method


# virtual methods
.method public d()I
    .locals 2

    iget v0, p0, Lnet/time4j/calendar/c$a;->a:I

    add-int/lit8 v0, v0, -0x1

    mul-int/lit8 v0, v0, 0x3c

    iget-object v1, p0, Lnet/time4j/calendar/c$a;->b:Lnet/time4j/calendar/c;

    invoke-virtual {v1}, Lnet/time4j/calendar/o;->getNumber()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0
.end method
