.class public Lce/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/j;


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lce/f;->a:I

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
.end method


# virtual methods
.method public a(Lde/g;)V
    .locals 1

    iget-object p1, p1, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    iget v0, p0, Lce/f;->a:I

    invoke-interface {p1, v0}, Lcom/henninghall/date_picker/pickers/a;->setDividerHeight(I)V

    return-void
.end method
