.class final Ldh/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldh/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ldi/g0;

.field private final b:I


# direct methods
.method public constructor <init>(Ldi/g0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldh/d$a;->a:Ldi/g0;

    iput p2, p0, Ldh/d$a;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Ldh/d$a;->b:I

    return v0
.end method

.method public final b()Ldi/g0;
    .locals 1

    iget-object v0, p0, Ldh/d$a;->a:Ldi/g0;

    return-object v0
.end method
